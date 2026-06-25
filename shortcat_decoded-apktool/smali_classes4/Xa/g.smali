.class public final LXa/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LXa/h;


# static fields
.field public static final a:LXa/g;

.field private static b:LXa/h;

.field private static final c:LXa/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LXa/g;

    .line 2
    .line 3
    invoke-direct {v0}, LXa/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LXa/g;->a:LXa/g;

    .line 7
    .line 8
    new-instance v0, LXa/d;

    .line 9
    .line 10
    invoke-direct {v0}, LXa/d;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LXa/g;->c:LXa/h;

    .line 14
    .line 15
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


# virtual methods
.method public a()I
    .locals 1

    .line 1
    sget-object v0, LXa/g;->b:LXa/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LXa/h;->a()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    sget-object v0, LXa/g;->c:LXa/h;

    .line 11
    .line 12
    invoke-interface {v0}, LXa/h;->a()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method
