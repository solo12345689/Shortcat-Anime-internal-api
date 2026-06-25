.class public abstract Ll0/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll0/i$a;
    }
.end annotation


# static fields
.field public static final a:Ll0/i$a;

.field private static final b:F

.field private static final c:F

.field private static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll0/i$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll0/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll0/i;->a:Ll0/i$a;

    .line 8
    .line 9
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 10
    .line 11
    invoke-static {v0}, Ll0/i;->b(F)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, Ll0/i;->b:F

    .line 16
    .line 17
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 18
    .line 19
    invoke-static {v0}, Ll0/i;->b(F)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Ll0/i;->c:F

    .line 24
    .line 25
    const/high16 v0, -0x3f800000    # -4.0f

    .line 26
    .line 27
    invoke-static {v0}, Ll0/i;->b(F)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sput v0, Ll0/i;->d:F

    .line 32
    .line 33
    return-void
.end method

.method public static final synthetic a()F
    .locals 1

    .line 1
    sget v0, Ll0/i;->d:F

    .line 2
    .line 3
    return v0
.end method

.method private static b(F)F
    .locals 0

    .line 1
    return p0
.end method
