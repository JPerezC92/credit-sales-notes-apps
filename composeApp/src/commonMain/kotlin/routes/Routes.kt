package routes

enum class Routes(val path: String) {
    Home("/");

    enum class Auth(val path: String) {
        Root("/auth"),
        Login("${Routes.Auth.Root}/login"),
        Register("${Routes.Auth.Root}/register"),
        ResetPassword(
            "${Routes.Auth.Root}/reset-password"
        );
    }
}