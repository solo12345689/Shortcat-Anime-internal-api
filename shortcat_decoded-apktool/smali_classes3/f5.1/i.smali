.class public abstract Lf5/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LS4/g;

.field public static final b:LS4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    .line 2
    .line 3
    sget-object v1, LS4/b;->c:LS4/b;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS4/g;->f(Ljava/lang/String;Ljava/lang/Object;)LS4/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lf5/i;->a:LS4/g;

    .line 10
    .line 11
    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v0, v1}, LS4/g;->f(Ljava/lang/String;Ljava/lang/Object;)LS4/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lf5/i;->b:LS4/g;

    .line 20
    .line 21
    return-void
.end method
