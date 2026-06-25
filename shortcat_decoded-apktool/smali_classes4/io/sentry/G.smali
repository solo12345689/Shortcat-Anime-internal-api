.class public final Lio/sentry/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/G$a;
    }
.end annotation


# static fields
.field private static final b:Lio/sentry/G;


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/G;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/G;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/G;->b:Lio/sentry/G;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/G;->a:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method public static a()Lio/sentry/G;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/G;->b:Lio/sentry/G;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public b(Lio/sentry/G$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/G;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
