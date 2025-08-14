package com.expectale

import xyz.xenondevs.nova.addon.Addon
import xyz.xenondevs.nova.update.ProjectDistributor


object SimpleElevator : Addon() {
    
    override val projectDistributors = listOf(ProjectDistributor.github("Atea-Studio/SimpleElevator"))
    
}