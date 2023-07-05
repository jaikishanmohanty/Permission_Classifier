package com.example.permissionclassifier;

public class PermissionSafetyChecker {
    public static boolean isPermissionSafe(String category, String permission) {
        switch (category) {
            case "Action":
                return ActionCategoryPermissions.isSafePermission(permission);
            case "Adventure":
                return AdventureCategoryPermissions.isSafePermission(permission);
            case "Arcade":
                return ArcadeCategoryPermissions.isSafePermission(permission);
            case "Art & Design":
                return ArtAndDesignCategoryPermissions.isSafePermission(permission);
            case "Auto & Vehicles":
                return AutoAndVehiclesCategoryPermissions.isSafePermission(permission);
            case "Beauty":
                return BeautyCategoryPermissions.isSafePermission(permission);
            case "Board":
                return BoardCategoryPermissions.isSafePermission(permission);
            case "Books & Reference":
                return BooksAndReferenceCategoryPermissions.isSafePermission(permission);
            case "Business":
                return BusinessCategoryPermissions.isSafePermission(permission);
            case "CARD":
                return CardCategoryPermissions.isSafePermission(permission);
            case "Casino":
                return CasinoCategoryPermissions.isSafePermission(permission);
            case "Casual":
                return CasualCategoryPermissions.isSafePermission(permission);
            case "Comics":
                return ComicsCategoryPermissions.isSafePermission(permission);
            case "Communication":
                return CommunicationCategoryPermissions.isSafePermission(permission);
            case "Dating":
                return DatingCategoryPermissions.isSafePermission(permission);
            case "Education":
                return EducationCategoryPermissions.isSafePermission(permission);
            case "Educational":
                return EducationalCategoryPermissions.isSafePermission(permission);
            case "Entertainment":
                return EntertainmentCategoryPermissions.isSafePermission(permission);
            case "Events":
                return EventsCategoryPermissions.isSafePermission(permission);
            case "Finance":
                return FinanceCategoryPermissions.isSafePermission(permission);
            case "Food & Drink":
                return FoodAndDrinkCategoryPermissions.isSafePermission(permission);
            case "Health & Fitness":
                return HealthAndFitnessCategoryPermissions.isSafePermission(permission);
            case "House & Home":
                return HouseAndHomeCategoryPermissions.isSafePermission(permission);
            case "Libraries & Demo":
                return LibrariesAndDemoCategoryPermissions.isSafePermission(permission);
            case "Lifestyle":
                return LifestyleCategoryPermissions.isSafePermission(permission);
            case "Maps & Navigation":
                return MapsAndNavigationCategoryPermissions.isSafePermission(permission);
            case "Medical":
                return MedicalCategoryPermissions.isSafePermission(permission);
            case "Music":
                return MusicCategoryPermissions.isSafePermission(permission);
            case "Music & Audio":
                return MusicAndAudioCategoryPermissions.isSafePermission(permission);
            case "News & Magazines":
                return NewsAndMagazinesCategoryPermissions.isSafePermission(permission);
            case "Parenting":
                return ParentingCategoryPermissions.isSafePermission(permission);
            case "Personalization":
                return PersonalizationCategoryPermissions.isSafePermission(permission);
            case "Photography":
                return PhotographyCategoryPermissions.isSafePermission(permission);
            case "Productivity":
                return ProductivityCategoryPermissions.isSafePermission(permission);
            case "Puzzle":
                return PuzzleCategoryPermissions.isSafePermission(permission);
            case "Racing":
                return RacingCategoryPermissions.isSafePermission(permission);
            case "Role Playing":
                return RolePlayingCategoryPermissions.isSafePermission(permission);
            case "Shopping":
                return ShoppingCategoryPermissions.isSafePermission(permission);
            case "Simulation":
                return SimulationCategoryPermissions.isSafePermission(permission);
            case "Social":
                return SocialCategoryPermissions.isSafePermission(permission);
            case "Sports":
                return SportsCategoryPermissions.isSafePermission(permission);
            case "Strategy":
                return StrategyCategoryPermissions.isSafePermission(permission);
            case "Tools":
                return ToolsCategoryPermissions.isSafePermission(permission);
            case "Travel & Local":
                return TravelAndLocalCategoryPermissions.isSafePermission(permission);
            case "Trivia":
                return TriviaCategoryPermissions.isSafePermission(permission);
            case "Video Players & Editors":
                return VideoPlayersAndEditorsCategoryPermissions.isSafePermission(permission);
            case "Weather":
                return WeatherCategoryPermissions.isSafePermission(permission);
            case "Word":
                return WordCategoryPermissions.isSafePermission(permission);

        }
        return false;
    }
}
class MusicCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCESS_BLUETOOTH_SHARE") ||
                permission.contains("RECORD_AUDIO") ||
                permission.contains("MODIFY_AUDIO_SETTINGS") ||
                permission.contains("CHANGE_WIFI_MULTICAST_STATE") ||
                permission.contains("CHECK_LICENSE");
    }
}
class ActionCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("CHANGE_WIFI_MULTICAST_STATE") ||
                permission.contains("CHECK_LICENSE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("MODIFY_AUDIO_SETTINGS") ||
                permission.contains("CONTENT_READ");
    }
}

class AdventureCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("CHANGE_WIFI_MULTICAST_STATE") ||
                permission.contains("CHECK_LICENSE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CONTENT_READ");
    }
}
 class ArcadeCategoryPermissions {

     public static boolean isSafePermission(String permission) {
         return permission.contains("ACCESS_NETWORK_STATE") ||
                 permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                 permission.contains("MANAGE_USB") ||
                 permission.contains("DEVICE_POWER") ||
                 permission.contains("READ_WIFI_CREDENTIAL") ||
                 permission.contains("VIBRATE") ||
                 permission.contains("RESTART_PACKAGES") ||
                 permission.contains("READ_PHONE_STATE") ||
                 permission.contains("CHANGE_WIFI_MULTICAST_STATE") ||
                 permission.contains("CHECK_LICENSE") ||
                 permission.contains("ACCOUNT_MANAGER") ||
                 permission.contains("ACCESS_COARSE_LOCATION") ||
                 permission.contains("ACCESS_FINE_LOCATION") ||
                 permission.contains("CONTENT_READ");

     }

 }
class ArtAndDesignCategoryPermissions {

    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("VIBRATE") ||
                permission.contains("CAMERA") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("SET_WALLPAPER");
    }

}
class AutoAndVehiclesCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("VIBRATE") ||
                permission.contains("CAMERA") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("ACCESS_BLUETOOTH_SHARE") ||
                permission.contains("BLUETOOTH_ADMIN") ||
                permission.contains("CALL_PRIVILEGED") ||
                permission.contains("READ_GSERVICES") ||
                permission.contains("HIDE_OVERLAY_WINDOWS") ||
                permission.contains("RECORD_AUDIO") ||
                permission.contains("NEARBY_WIFI_DEVICES") ||
                permission.contains("READ_CONTACTS");

    }
}

class BeautyCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CAMERA") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("SET_WALLPAPER") ||
                permission.contains("CALL_PRIVILEGED") ||
                permission.contains("READ_GSERVICES") ||
                permission.contains("ACCESS_BLUETOOTH_SHARE") ||
                permission.contains("RECORD_AUDIO");

    }
}

class BoardCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CAMERA") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("ACCESS_BLUETOOTH_SHARE") ||
                permission.contains("CHANGE_WIFI_MULTICAST_STATE");

    }
}

class BooksAndReferenceCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("READ_PHONE_STATE");

    }
}

class BusinessCategoryPermissions{
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CAMERA") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("RECORD_AUDIO");

    }
}

class CardCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("USE_CREDENTIALS") ||
                permission.contains("RECORD_AUDIO") ||
                permission.contains("GET_TASKS") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CAMERA") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("DEVICE_POWER");

    }
}

class CasinoCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("NEARBY_WIFI_DEVICES") ||
                permission.contains("GET_TASKS") ||
                permission.contains("CHANGE_NETWORK_STATE");

    }
}

class CasualCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("CHANGE_WIFI_MULTICAST_STATE") ||
                permission.contains("GET_TASKS") ||
                permission.contains("CHANGE_NETWORK_STATE") ||
                permission.contains("CHECK_LICENSE") ||
                permission.contains("RECORD_AUDIO") ||
                permission.contains("CAMERA") ||
                permission.contains("ACCESS_BLUETOOTH_SHARE") ||
                permission.contains("MODIFY_AUDIO_SETTINGS") ||
                permission.contains("NEARBY_WIFI_DEVICES") ||
                permission.contains("READ_MY_DATA") ||
                permission.contains("SET_ALARM") ||
                permission.contains("HIDE_OVERLAY_WINDOWS") ||
                permission.contains("WRITE_EXTERNAL_STORAGE") ||
                permission.contains("READ_GSERVICES") ||
                permission.contains("INSTALL_SHORTCUT") ||
                permission.contains("USE_CREDENTIALS") ||
                permission.contains("WRITE_SETTINGS") ||
                permission.contains("WAKE_LOCK");

    }
}
class ComicsCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CAMERA") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER");

    }

}

class CommunicationCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CAMERA") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("RECORD_AUDIO") ||
                permission.contains("READ_CONTACTS") ||
                permission.contains("MODIFY_AUDIO_SETTINGS") ||
                permission.contains("ACCESS_BLUETOOTH_SHARE") ||
                permission.contains("CALL_PRIVILEGED") ||
                permission.contains("HIDE_OVERLAY_WINDOWS") ||
                permission.contains("WRITE_CONTACTS");

    }
}

class DatingCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CAMERA") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("MODIFY_AUDIO_SETTINGS") ||
                permission.contains("RECORD_AUDIO") ||
                permission.contains("ACCESS_BLUETOOTH_SHARE") ||
                permission.contains("READ_GSERVICES") ||
                permission.contains("HIDE_OVERLAY_WINDOWS") ||
                permission.contains("READ_CONTACTS");

    }
}
class EducationCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") ||
                permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CAMERA") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("MODIFY_AUDIO_SETTINGS") ||
                permission.contains("RECORD_AUDIO") ||
                permission.contains("ACCESS_BLUETOOTH_SHARE") ||
                permission.contains("READ_GSERVICES") ||
                permission.contains("HIDE_OVERLAY_WINDOWS") ||
                permission.contains("READ_CONTACTS") ||
                permission.contains("CALL_PRIVILEGED") ||
                permission.contains("WRITE_CALENDAR") ||
                permission.contains("READ_CALENDAR");

    }


}
class EducationalCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("MODIFY_AUDIO_SETTINGS") || permission.contains("RECORD_AUDIO") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("HIDE_OVERLAY_WINDOWS") || permission.contains("CHANGE_WIFI_MULTICAST_STATE") || permission.contains("CHECK_LICENSE") || permission.contains("GET_TASKS");

    }
}

class EntertainmentCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("RECORD_AUDIO");

    }
}

class EventsCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") ||
                permission.contains("CONTENT_READ") ||
                permission.contains("MANAGE_USB") ||
                permission.contains("DEVICE_POWER") ||
                permission.contains("VIBRATE") ||
                permission.contains("RESTART_PACKAGES") ||
                permission.contains("READ_WIFI_CREDENTIAL") ||
                permission.contains("ACCESS_FINE_LOCATION") ||
                permission.contains("CAMERA") ||
                permission.contains("ACCESS_COARSE_LOCATION") ||
                permission.contains("READ_PHONE_STATE") ||
                permission.contains("ACCOUNT_MANAGER") ||
                permission.contains("MODIFY_AUDIO_SETTINGS") ||
                permission.contains("RECORD_AUDIO") ||
                permission.contains("ACCESS_BLUETOOTH_SHARE") ||
                permission.contains("HIDE_OVERLAY_WINDOWS") ||
                permission.contains("CHECK_LICENSE") ||
                permission.contains("WRITE_CALENDAR") ||
                permission.contains("READ_CALENDAR") ||
                permission.contains("READ_GSERVICES") ||
                permission.contains("READ_CONTACTS") ||
                permission.contains("BLUETOOTH_ADMIN") ||
                permission.contains("WRITE_CONTACTS") ||
                permission.contains("FLASHLIGHT") ||
                permission.contains("CALL_PRIVILEGED") ||
                permission.contains("NEARBY_WIFI_DEVICES");
    }

}

class FinanceCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE")
                || permission.contains("READ_NETWORK_USAGE_HISTORY")
                || permission.contains("CONTENT_READ")
                || permission.contains("MANAGE_USB")
                || permission.contains("DEVICE_POWER")
                || permission.contains("VIBRATE")
                || permission.contains("RESTART_PACKAGES")
                || permission.contains("READ_WIFI_CREDENTIAL")
                || permission.contains("ACCESS_FINE_LOCATION")
                || permission.contains("CAMERA")
                || permission.contains("ACCESS_COARSE_LOCATION")
                || permission.contains("READ_PHONE_STATE")
                || permission.contains("ACCOUNT_MANAGER")
                || permission.contains("READ_CONTACTS");

    }
}

class FoodAndDrinkCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE")
                || permission.contains("READ_NETWORK_USAGE_HISTORY")
                || permission.contains("CONTENT_READ")
                || permission.contains("MANAGE_USB")
                || permission.contains("DEVICE_POWER")
                || permission.contains("VIBRATE")
                || permission.contains("RESTART_PACKAGES")
                || permission.contains("READ_WIFI_CREDENTIAL")
                || permission.contains("ACCESS_FINE_LOCATION")
                || permission.contains("CAMERA")
                || permission.contains("ACCESS_COARSE_LOCATION")
                || permission.contains("READ_PHONE_STATE")
                || permission.contains("ACCOUNT_MANAGER")
                || permission.contains("READ_GSERVICES")
                || permission.contains("CALL_PRIVILEGED")
                || permission.contains("HIDE_OVERLAY_WINDOWS");

    }
}

class HealthAndFitnessCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE")
                || permission.contains("READ_NETWORK_USAGE_HISTORY")
                || permission.contains("CONTENT_READ")
                || permission.contains("MANAGE_USB")
                || permission.contains("DEVICE_POWER")
                || permission.contains("VIBRATE")
                || permission.contains("RESTART_PACKAGES")
                || permission.contains("READ_WIFI_CREDENTIAL")
                || permission.contains("ACCESS_FINE_LOCATION")
                || permission.contains("CAMERA")
                || permission.contains("ACCESS_COARSE_LOCATION")
                || permission.contains("READ_PHONE_STATE")
                || permission.contains("ACCOUNT_MANAGER")
                || permission.contains("MODIFY_AUDIO_SETTINGS")
                || permission.contains("RECORD_AUDIO")
                || permission.contains("ACCESS_BLUETOOTH_SHARE")
                || permission.contains("HIDE_OVERLAY_WINDOWS")
                || permission.contains("CHECK_LICENSE")
                || permission.contains("WRITE_CALENDAR")
                || permission.contains("READ_CALENDAR")
                || permission.contains("READ_GSERVICES")
                || permission.contains("READ_CONTACTS")
                || permission.contains("BLUETOOTH_ADMIN")
                || permission.contains("CALL_PRIVILEGED")
                || permission.contains("NEARBY_WIFI_DEVICES");

    }
}

class HouseAndHomeCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE")
                || permission.contains("READ_NETWORK_USAGE_HISTORY")
                || permission.contains("CONTENT_READ")
                || permission.contains("MANAGE_USB")
                || permission.contains("DEVICE_POWER")
                || permission.contains("VIBRATE")
                || permission.contains("RESTART_PACKAGES")
                || permission.contains("READ_WIFI_CREDENTIAL")
                || permission.contains("ACCESS_FINE_LOCATION")
                || permission.contains("CAMERA")
                || permission.contains("ACCESS_COARSE_LOCATION")
                || permission.contains("READ_PHONE_STATE")
                || permission.contains("ACCOUNT_MANAGER")
                || permission.contains("RECORD_AUDIO");

    }
}

class LibrariesAndDemoCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE")
                || permission.contains("READ_NETWORK_USAGE_HISTORY")
                || permission.contains("CONTENT_READ")
                || permission.contains("MANAGE_USB")
                || permission.contains("DEVICE_POWER")
                || permission.contains("VIBRATE")
                || permission.contains("RESTART_PACKAGES")
                || permission.contains("READ_WIFI_CREDENTIAL")
                || permission.contains("ACCESS_FINE_LOCATION")
                || permission.contains("CAMERA")
                || permission.contains("ACCESS_COARSE_LOCATION")
                || permission.contains("READ_PHONE_STATE")
                || permission.contains("ACCOUNT_MANAGER")
                || permission.contains("RECORD_AUDIO")
                || permission.contains("ACCESS_BLUETOOTH_SHARE")
                || permission.contains("BLUETOOTH_ADMIN")
                || permission.contains("HIDE_OVERLAY_WINDOWS");

    }
}

class LifestyleCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("READ_GSERVICES") || permission.contains("READ_CONTACTS");

    }
}

class MapsAndNavigationCategoryPermissions {
    public static boolean isSafePermission(String permission){
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("READ_GSERVICES") || permission.contains("READ_CONTACTS") || permission.contains("CALL_PRIVILEGED") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("HIDE_OVERLAY_WINDOWS") || permission.contains("RECORD_AUDIO") || permission.contains("BLUETOOTH_ADMIN") || permission.contains("NEARBY_WIFI_DEVICES") || permission.contains("MODIFY_AUDIO_SETTINGS") || permission.contains("GET_TASKS");

    }
}

class MedicalCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("RECORD_AUDIO") || permission.contains("MODIFY_AUDIO_SETTINGS");
    }


}

class MusicAndAudioCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("RECORD_AUDIO") || permission.contains("MODIFY_AUDIO_SETTINGS") || permission.contains("WRITE_SETTINGS");
    }
}

class NewsAndMagazinesCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("READ_GSERVICES");
    }
}

class ParentingCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("RECORD_AUDIO") || permission.contains("MODIFY_AUDIO_SETTINGS") || permission.contains("NEARBY_WIFI_DEVICES") || permission.contains("HIDE_OVERLAY_WINDOWS") || permission.contains("READ_GSERVICES") || permission.contains("READ_CONTACTS") || permission.contains("GET_TASKS") || permission.contains("WRITE_SETTINGS") || permission.contains("READ_CALENDAR");
    }
}

class PersonalizationCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("SET_WALLPAPER") || permission.contains("WRITE_SETTINGS") || permission.contains("READ_PHONE_STATE");
    }
}

class PhotographyCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("RECORD_AUDIO") || permission.contains("SET_WALLPAPER");
    }

}

class ProductivityCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains( "READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("RECORD_AUDIO") || permission.contains("READ_CONTACTS") || permission.contains("HIDE_OVERLAY_WINDOWS") || permission.contains("READ_GSERVICES") || permission.contains("BLUETOOTH_ADMIN");
    }
}

class PuzzleCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CHANGE_WIFI_MULTICAST_STATE") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("CHECK_LICENSE");
    }
}

class RacingCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CHANGE_WIFI_MULTICAST_STATE") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("CHECK_LICENSE") || permission.contains("SET_ALARM") || permission.contains("NEARBY_WIFI_DEVICES") || permission.contains("GET_TASKS") || permission.contains("RECORD_AUDIO");
    }
}

class RolePlayingCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION");
    }
}

class ShoppingCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION");
    }
}

class SimulationCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("READ_PHONE_STATE");
    }
}

class SocialCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("RECORD_AUDIO") || permission.contains("MODIFY_AUDIO_SETTINGS") || permission.contains("HIDE_OVERLAY_WINDOWS") || permission.contains("READ_GSERVICES") || permission.contains("READ_CONTACTS") || permission.contains("CALL_PRIVILEGED");
    }
}

class SportsCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER");
    }
}

class StrategyCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("CHECK_LICENSE") || permission.contains("GET_TASKS") || permission.contains("NEARBY_WIFI_DEVICES") || permission.contains("USE_CREDENTIALS") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("CAMERA");
    }
}

class ToolsCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("NEARBY_WIFI_DEVICES") || permission.contains("BLUETOOTH_ADMIN") || permission.contains("HIDE_OVERLAY_WINDOWS") || permission.contains("RECORD_AUDIO");
    }

}

class TravelAndLocalCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("READ_GSERVICES") || permission.contains("BLUETOOTH_ADMIN") || permission.contains("HIDE_OVERLAY_WINDOWS") || permission.contains("RECORD_AUDIO") || permission.contains("CALL_PRIVILEGED");
    }


}

class TriviaCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER");
    }


}

class VideoPlayersAndEditorsCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("CAMERA") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("HIDE_OVERLAY_WINDOWS") || permission.contains("RECORD_AUDIO") || permission.contains("NEARBY_WIFI_DEVICES") || permission.contains("WRITE_SETTINGS") || permission.contains("MODIFY_AUDIO_SETTINGS") || permission.contains("CHANGE_NETWORK_STATE") || permission.contains("WRITE_EXTERNAL_STORAGE") || permission.contains("CHANGE_WIFI_MULTICAST_STATE") || permission.contains("GET_TASKS") || permission.contains("INSTALL_SHORTCUT");
    }
}

class WeatherCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("READ_GSERVICES") || permission.contains("ACCESS_BLUETOOTH_SHARE") || permission.contains("CHANGE_WIFI_MULTICAST_STATE") || permission.contains("CAMERA") || permission.contains("NEARBY_WIFI_DEVICES") || permission.contains("HIDE_OVERLAY_WINDOWS") || permission.contains("BLUETOOTH_ADMIN");
    }


}

class WordCategoryPermissions {
    public static boolean isSafePermission(String permission) {
        return permission.contains("ACCESS_NETWORK_STATE") || permission.contains("READ_NETWORK_USAGE_HISTORY") || permission.contains("CONTENT_READ") || permission.contains("MANAGE_USB") || permission.contains("DEVICE_POWER") || permission.contains("VIBRATE") || permission.contains("RESTART_PACKAGES") || permission.contains("READ_WIFI_CREDENTIAL") || permission.contains("ACCESS_FINE_LOCATION") || permission.contains("ACCESS_COARSE_LOCATION") || permission.contains("READ_PHONE_STATE") || permission.contains("ACCOUNT_MANAGER") || permission.contains("SET_ALARM") || permission.contains("CHECK_LICENSE") || permission.contains("CHANGE_WIFI_MULTICAST_STATE") || permission.contains("NEARBY_WIFI_DEVICES");
    }
}










