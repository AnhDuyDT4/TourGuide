package com.jk.tourguide.screen.category

import android.os.Bundle
import androidx.navigation.NavDirections
import com.jk.tourguide.R
import kotlin.Int
import kotlin.String

public class CategoriesFragmentDirections private constructor() {
  private data class ToAttractionFragment(
    public val categoryId: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.toAttractionFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("category_id", this.categoryId)
        return result
      }
  }

  public companion object {
    public fun toAttractionFragment(categoryId: String): NavDirections =
        ToAttractionFragment(categoryId)
  }
}
