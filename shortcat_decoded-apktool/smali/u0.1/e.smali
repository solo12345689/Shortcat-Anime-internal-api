.class public abstract Lu0/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Li1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0, v0}, Li1/f;->a(FF)Li1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lu0/e;->a:Li1/d;

    .line 8
    .line 9
    return-void
.end method

.method public static final a()Li1/d;
    .locals 1

    .line 1
    sget-object v0, Lu0/e;->a:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method
