.class public Lo4/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Li4/f;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private final a:Lp4/b;

.field final b:Landroidx/work/impl/foreground/a;

.field final c:Ln4/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WMFgUpdater"

    .line 2
    .line 3
    invoke-static {v0}, Li4/i;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lo4/B;->d:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/foreground/a;Lp4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lo4/B;->b:Landroidx/work/impl/foreground/a;

    .line 5
    .line 6
    iput-object p3, p0, Lo4/B;->a:Lp4/b;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lo4/B;->c:Ln4/v;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Li4/e;)Lcom/google/common/util/concurrent/p;
    .locals 7

    .line 1
    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    iget-object v6, p0, Lo4/B;->a:Lp4/b;

    .line 6
    .line 7
    new-instance v0, Lo4/B$a;

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    move-object v5, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    invoke-direct/range {v0 .. v5}, Lo4/B$a;-><init>(Lo4/B;Landroidx/work/impl/utils/futures/c;Ljava/util/UUID;Li4/e;Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v6, v0}, Lp4/b;->c(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-object v2
.end method
