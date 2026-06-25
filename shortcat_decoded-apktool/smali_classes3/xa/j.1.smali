.class public Lxa/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxa/j$a;
    }
.end annotation


# static fields
.field private static b:Z = true

.field private static volatile c:Lxa/j;

.field static final d:Lxa/j;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxa/j;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lxa/j;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxa/j;->d:Lxa/j;

    .line 8
    .line 9
    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 5
    .line 6
    iput-object p1, p0, Lxa/j;->a:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public static b()Lxa/j;
    .locals 2

    .line 1
    sget-boolean v0, Lxa/j;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lxa/j;->d:Lxa/j;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-object v0, Lxa/j;->c:Lxa/j;

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    const-class v1, Lxa/j;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v0, Lxa/j;->c:Lxa/j;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-static {}, Lxa/i;->a()Lxa/j;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lxa/j;->c:Lxa/j;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    monitor-exit v1

    .line 29
    return-object v0

    .line 30
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw v0

    .line 32
    :cond_2
    return-object v0
.end method


# virtual methods
.method public a(Lxa/D;I)Lxa/p$c;
    .locals 2

    .line 1
    iget-object v0, p0, Lxa/j;->a:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v1, Lxa/j$a;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lxa/j$a;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1
.end method
