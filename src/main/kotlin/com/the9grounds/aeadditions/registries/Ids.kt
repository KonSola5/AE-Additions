package com.the9grounds.aeadditions.registries

import com.the9grounds.aeadditions.AEAdditions
import net.minecraft.resources.ResourceLocation

object Ids {

    // Components
    val CELL_COMPONENT_1024 = id("cell_component_1024")
    val CELL_COMPONENT_4096 = id("cell_component_4096")
    val CELL_COMPONENT_16384 = id("cell_component_16384")
    val CELL_COMPONENT_65536 = id("cell_component_65536")

    // Cells
    val ITEM_STORAGE_CELL_1024 = id("item_storage_cell_1024")
    val ITEM_STORAGE_CELL_4096 = id("item_storage_cell_4096")
    val ITEM_STORAGE_CELL_16384 = id("item_storage_cell_16384")
    val ITEM_STORAGE_CELL_65536 = id("item_storage_cell_65536")
    
    val FLUID_STORAGE_CELL_1024 = id("fluid_storage_cell_1024")
    val FLUID_STORAGE_CELL_4096 = id("fluid_storage_cell_4096")
    val FLUID_STORAGE_CELL_16384 = id("fluid_storage_cell_16384")
    
    // Disk
    val DISK_256k = id("disk_item_256k")
    val DISK_1024k = id("disk_item_1024k")
    val DISK_4096k = id("disk_item_4096k")
    val DISK_16384k = id("disk_item_16384k")
    val DISK_65536k = id("disk_item_65536k")
    
    // Fluid Disks
    val DISK_FLUID_HOUSING = id("disk_fluid_housing")
    val DISK_FLUID_1k = id("disk_fluid_1k")
    val DISK_FLUID_4k = id("disk_fluid_4k")
    val DISK_FLUID_16k = id("disk_fluid_16k")
    val DISK_FLUID_64k = id("disk_fluid_64k")
    val DISK_FLUID_256k = id("disk_fluid_256k")
    val DISK_FLUID_1024k = id("disk_fluid_1024k")
    val DISK_FLUID_4096k = id("disk_fluid_4096k")
    val DISK_FLUID_16384k = id("disk_fluid_16384k")
    val DISK_FLUID_65536k = id("disk_fluid_65536k")
    
    // Blocks
    val CRAFTING_STORAGE_1024k = id("1024k_crafting_storage")
    val CRAFTING_STORAGE_4096k = id("4096k_crafting_storage")
    val CRAFTING_STORAGE_16384k = id("16384k_crafting_storage")
    val CRAFTING_STORAGE_65536k = id("65536k_crafting_storage")
    

    private fun id(id: String): ResourceLocation = ResourceLocation(AEAdditions.MOD_ID, id)
}