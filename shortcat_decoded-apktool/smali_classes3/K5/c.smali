.class public final LK5/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LK5/c;

.field private static b:LK5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK5/c;

    .line 2
    .line 3
    invoke-direct {v0}, LK5/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK5/c;->a:LK5/c;

    .line 7
    .line 8
    sget-object v0, LK5/a;->a:LK5/a;

    .line 9
    .line 10
    sput-object v0, LK5/c;->b:LK5/b;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a()LK5/b;
    .locals 1

    .line 1
    sget-object v0, LK5/c;->b:LK5/b;

    .line 2
    .line 3
    return-object v0
.end method
