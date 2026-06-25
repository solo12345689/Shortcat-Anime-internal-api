.class final synthetic Landroidx/compose/foundation/relocation/f$b$a$a;
.super Lkotlin/jvm/internal/p;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/relocation/f;

.field final synthetic b:LI0/p;

.field final synthetic c:Lie/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;LI0/p;Lie/a;)V
    .locals 6

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->a:Landroidx/compose/foundation/relocation/f;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->b:LI0/p;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->c:Lie/a;

    .line 6
    .line 7
    const-string v4, "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-class v2, Lkotlin/jvm/internal/s$a;

    .line 12
    .line 13
    const-string v3, "localRect"

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/relocation/f$b$a$a;->j()Lr0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final j()Lr0/h;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->a:Landroidx/compose/foundation/relocation/f;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->b:LI0/p;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->c:Lie/a;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/relocation/f;->E1(Landroidx/compose/foundation/relocation/f;LI0/p;Lie/a;)Lr0/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
