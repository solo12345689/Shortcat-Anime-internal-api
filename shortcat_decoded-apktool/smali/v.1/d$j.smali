.class final Lv/d$j;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/d;->f(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/o;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/o0;

.field final synthetic b:Lkotlin/jvm/functions/Function1;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Landroidx/compose/animation/h;

.field final synthetic e:Landroidx/compose/animation/j;

.field final synthetic f:Lie/o;

.field final synthetic g:I


# direct methods
.method constructor <init>(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/o;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/d$j;->a:Lw/o0;

    .line 2
    .line 3
    iput-object p2, p0, Lv/d$j;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iput-object p3, p0, Lv/d$j;->c:Landroidx/compose/ui/e;

    .line 6
    .line 7
    iput-object p4, p0, Lv/d$j;->d:Landroidx/compose/animation/h;

    .line 8
    .line 9
    iput-object p5, p0, Lv/d$j;->e:Landroidx/compose/animation/j;

    .line 10
    .line 11
    iput-object p6, p0, Lv/d$j;->f:Lie/o;

    .line 12
    .line 13
    iput p7, p0, Lv/d$j;->g:I

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/d$j;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 8

    .line 2
    iget-object v0, p0, Lv/d$j;->a:Lw/o0;

    iget-object v1, p0, Lv/d$j;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv/d$j;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Lv/d$j;->d:Landroidx/compose/animation/h;

    iget-object v4, p0, Lv/d$j;->e:Landroidx/compose/animation/j;

    iget-object v5, p0, Lv/d$j;->f:Lie/o;

    iget p2, p0, Lv/d$j;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v7

    move-object v6, p1

    invoke-static/range {v0 .. v7}, Lv/d;->f(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/o;LY/m;I)V

    return-void
.end method
