package com.example.dessertrelease.data.local
import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import androidx.datastore.preferences.core.emptyPreferences

class UserPreferencesRepository(private val dataStore: DataStore<androidx.datastore.preferences.core.Preferences>){

    private companion object {
        val IS_LINEAR_LAYOUT = booleanPreferencesKey("is_linear_layout")
        const val TAG = "UserPreferencesRepo"
    }

    val isLinearLayout: Flow<Boolean> = dataStore.data
        .catch { exception ->
            if (exception is IOException) {
                Log.e(TAG, "Error reading preferences.", exception)
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }
        .map { preferences ->
            preferences[IS_LINEAR_LAYOUT] ?: true
        }

    suspend fun saveLayoutPreference(isLinearLayout: Boolean) {
        dataStore.edit { mutablePreferences ->
            mutablePreferences[IS_LINEAR_LAYOUT] = isLinearLayout
        }
    }
}