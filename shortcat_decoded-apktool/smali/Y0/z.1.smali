.class public abstract LY0/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY0/s0;

.field private static final b:LY0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY0/s0;

    .line 2
    .line 3
    invoke-direct {v0}, LY0/s0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY0/z;->a:LY0/s0;

    .line 7
    .line 8
    new-instance v0, LY0/n;

    .line 9
    .line 10
    invoke-direct {v0}, LY0/n;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LY0/z;->b:LY0/n;

    .line 14
    .line 15
    return-void
.end method

.method public static final a()LY0/n;
    .locals 1

    .line 1
    sget-object v0, LY0/z;->b:LY0/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b()LY0/s0;
    .locals 1

    .line 1
    sget-object v0, LY0/z;->a:LY0/s0;

    .line 2
    .line 3
    return-object v0
.end method
