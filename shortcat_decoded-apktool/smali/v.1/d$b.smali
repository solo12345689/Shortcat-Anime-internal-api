.class final Lv/d$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/d;->a(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function2;Lv/t;Lie/o;LY/m;II)V
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

.field final synthetic f:Lkotlin/jvm/functions/Function2;

.field final synthetic g:Lie/o;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function2;Lv/t;Lie/o;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/d$b;->a:Lw/o0;

    .line 2
    .line 3
    iput-object p2, p0, Lv/d$b;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iput-object p3, p0, Lv/d$b;->c:Landroidx/compose/ui/e;

    .line 6
    .line 7
    iput-object p4, p0, Lv/d$b;->d:Landroidx/compose/animation/h;

    .line 8
    .line 9
    iput-object p5, p0, Lv/d$b;->e:Landroidx/compose/animation/j;

    .line 10
    .line 11
    iput-object p6, p0, Lv/d$b;->f:Lkotlin/jvm/functions/Function2;

    .line 12
    .line 13
    iput-object p8, p0, Lv/d$b;->g:Lie/o;

    .line 14
    .line 15
    iput p9, p0, Lv/d$b;->h:I

    .line 16
    .line 17
    iput p10, p0, Lv/d$b;->i:I

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
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

    invoke-virtual {p0, p1, p2}, Lv/d$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 11

    .line 2
    iget-object v0, p0, Lv/d$b;->a:Lw/o0;

    iget-object v1, p0, Lv/d$b;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv/d$b;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Lv/d$b;->d:Landroidx/compose/animation/h;

    iget-object v4, p0, Lv/d$b;->e:Landroidx/compose/animation/j;

    iget-object v5, p0, Lv/d$b;->f:Lkotlin/jvm/functions/Function2;

    iget-object v7, p0, Lv/d$b;->g:Lie/o;

    iget p2, p0, Lv/d$b;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v9

    iget v10, p0, Lv/d$b;->i:I

    const/4 v6, 0x0

    move-object v8, p1

    invoke-static/range {v0 .. v10}, Lv/d;->a(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function2;Lv/t;Lie/o;LY/m;II)V

    return-void
.end method
