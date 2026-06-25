.class public abstract Lio/invertase/firebase/app/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static a:Landroid/content/Context;


# direct methods
.method public static a()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lio/invertase/firebase/app/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "ReactNativeFirebaseApp"

    .line 2
    .line 3
    const-string v1, "received application context."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    sput-object p0, Lio/invertase/firebase/app/a;->a:Landroid/content/Context;

    .line 9
    .line 10
    return-void
.end method
