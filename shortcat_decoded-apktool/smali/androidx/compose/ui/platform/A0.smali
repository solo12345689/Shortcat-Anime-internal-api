.class public final Landroidx/compose/ui/platform/A0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lh0/p;


# instance fields
.field private final synthetic a:Lh0/p;

.field private final b:Lie/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lh0/p;Lie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/A0;->a:Lh0/p;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/platform/A0;->b:Lie/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/A0;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh0/p;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/A0;->b:Lie/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/A0;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lh0/p;->d()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/A0;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh0/p;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public f(Ljava/lang/String;Lie/a;)Lh0/p$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/A0;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lh0/p;->f(Ljava/lang/String;Lie/a;)Lh0/p$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
