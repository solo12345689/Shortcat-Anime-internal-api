.class public abstract LBb/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "PUT"

    .line 2
    .line 3
    const-string v1, "PATCH"

    .line 4
    .line 5
    const-string v2, "POST"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LBb/j;->a:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public static final a()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LBb/j;->a:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
