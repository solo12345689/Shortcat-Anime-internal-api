.class public abstract Lec/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    .line 1
    invoke-static {}, Lec/b;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private static final b()I
    .locals 3

    .line 1
    sget v0, Lec/b;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int v2, v1, v0

    .line 5
    .line 6
    add-int/2addr v0, v1

    .line 7
    sput v0, Lec/b;->a:I

    .line 8
    .line 9
    return v2
.end method
