.class public abstract Le9/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Le9/b;

.field private static volatile b:Le9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le9/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le9/d;-><init>(Le9/c;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le9/e;->a:Le9/b;

    .line 8
    .line 9
    sput-object v0, Le9/e;->b:Le9/b;

    .line 10
    .line 11
    return-void
.end method

.method public static a()Le9/b;
    .locals 1

    .line 1
    sget-object v0, Le9/e;->b:Le9/b;

    .line 2
    .line 3
    return-object v0
.end method
