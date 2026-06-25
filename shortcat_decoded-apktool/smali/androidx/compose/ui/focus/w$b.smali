.class final Landroidx/compose/ui/focus/w$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/w;->l(Landroidx/compose/ui/focus/FocusTargetNode;Lr0/h;ILkotlin/jvm/functions/Function1;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/focus/FocusTargetNode;

.field final synthetic b:Landroidx/compose/ui/focus/FocusTargetNode;

.field final synthetic c:Lr0/h;

.field final synthetic d:I

.field final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;Lr0/h;ILkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/focus/w$b;->a:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/focus/w$b;->b:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/focus/w$b;->c:Lr0/h;

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/ui/focus/w$b;->d:I

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/ui/focus/w$b;->e:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(LI0/c$a;)Ljava/lang/Boolean;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/w$b;->a:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/focus/w$b;->b:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    invoke-static {v1}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/w$b;->b:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/compose/ui/focus/w$b;->c:Lr0/h;

    .line 25
    .line 26
    iget v2, p0, Landroidx/compose/ui/focus/w$b;->d:I

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/compose/ui/focus/w$b;->e:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/focus/w;->a(Landroidx/compose/ui/focus/FocusTargetNode;Lr0/h;ILkotlin/jvm/functions/Function1;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, LI0/c$a;->a()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    return-object p1

    .line 49
    :cond_2
    :goto_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LI0/c$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/w$b;->a(LI0/c$a;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
