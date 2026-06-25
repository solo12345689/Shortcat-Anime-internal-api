.class public final Lexpo/modules/splashscreen/SplashScreenOptions;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u0012\u0004\u0008\t\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008R(\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000b\u0010\u000c\u0012\u0004\u0008\u0011\u0010\u0003\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/splashscreen/SplashScreenOptions;",
        "Ljc/b;",
        "<init>",
        "()V",
        "",
        "duration",
        "J",
        "getDuration",
        "()J",
        "getDuration$annotations",
        "",
        "fade",
        "Z",
        "getFade",
        "()Z",
        "setFade",
        "(Z)V",
        "getFade$annotations",
        "expo-splash-screen_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final duration:J

.field private fade:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x190

    .line 5
    .line 6
    iput-wide v0, p0, Lexpo/modules/splashscreen/SplashScreenOptions;->duration:J

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lexpo/modules/splashscreen/SplashScreenOptions;->fade:Z

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic getDuration$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getFade$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/splashscreen/SplashScreenOptions;->duration:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getFade()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/splashscreen/SplashScreenOptions;->fade:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setFade(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/splashscreen/SplashScreenOptions;->fade:Z

    .line 2
    .line 3
    return-void
.end method
