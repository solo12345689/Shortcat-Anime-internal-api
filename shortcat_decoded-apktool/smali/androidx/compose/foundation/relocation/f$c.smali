.class final Landroidx/compose/foundation/relocation/f$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f;->o1(LI0/p;Lie/a;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/relocation/f;

.field final synthetic b:LI0/p;

.field final synthetic c:Lie/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;LI0/p;Lie/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$c;->a:Landroidx/compose/foundation/relocation/f;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$c;->b:LI0/p;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/relocation/f$c;->c:Lie/a;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Lr0/h;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$c;->a:Landroidx/compose/foundation/relocation/f;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$c;->b:LI0/p;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$c;->c:Lie/a;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/relocation/f;->E1(Landroidx/compose/foundation/relocation/f;LI0/p;Lie/a;)Lr0/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$c;->a:Landroidx/compose/foundation/relocation/f;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/compose/foundation/relocation/f;->G1()LH/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1, v0}, LH/c;->N(Lr0/h;)Lr0/h;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/relocation/f$c;->a()Lr0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
