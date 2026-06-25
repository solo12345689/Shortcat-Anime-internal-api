.class public abstract LHb/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LHb/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LHb/g;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v2, v1, [J

    .line 5
    .line 6
    fill-array-data v2, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/16 v4, 0x1e

    .line 11
    .line 12
    filled-new-array {v3, v4}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-array v1, v1, [J

    .line 17
    .line 18
    fill-array-data v1, :array_1

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v2, v3, v1}, LHb/g;-><init>([J[I[J)V

    .line 22
    .line 23
    .line 24
    sput-object v0, LHb/f;->a:LHb/g;

    .line 25
    .line 26
    return-void

    .line 27
    :array_0
    .array-data 8
        0x0
        0x32
    .end array-data

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    :array_1
    .array-data 8
        0x0
        0x46
    .end array-data
.end method

.method public static final a()LHb/g;
    .locals 1

    .line 1
    sget-object v0, LHb/f;->a:LHb/g;

    .line 2
    .line 3
    return-object v0
.end method
