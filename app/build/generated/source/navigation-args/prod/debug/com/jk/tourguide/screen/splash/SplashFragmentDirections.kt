package com.jk.tourguide.screen.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.jk.tourguide.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun toHomeFragment(): NavDirections = ActionOnlyNavDirections(R.id.toHomeFragment)
  }
}
