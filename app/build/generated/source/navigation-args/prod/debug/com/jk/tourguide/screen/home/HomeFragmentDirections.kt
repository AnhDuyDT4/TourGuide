package com.jk.tourguide.screen.home

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.jk.tourguide.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ToAttractionFragment(
    public val categoryIds: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.toAttractionFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("categoryIds", this.categoryIds)
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmenttToCeneryFragmentt(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragmentt_to_ceneryFragmentt)

    public fun toAttractionFragment(categoryIds: String): NavDirections =
        ToAttractionFragment(categoryIds)
  }
}
