package com.example.booksearchapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.booksearchapp.data.repository.BookSearchRepository

@Suppress("UNCHECKED_CAST")
class BookSearchViewModelProviderFactory(
    private val bookSearchResponsitory: BookSearchRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BookSearchViewModel::class.java)) {
            return BookSearchViewModel(bookSearchResponsitory) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}