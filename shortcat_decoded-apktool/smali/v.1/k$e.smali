.class final Lv/k$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/k;->b(Lw/o0;Landroidx/compose/ui/e;Lw/G;Lkotlin/jvm/functions/Function1;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/o0;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lw/G;

.field final synthetic d:Lkotlin/jvm/functions/Function1;

.field final synthetic e:Lie/o;

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method constructor <init>(Lw/o0;Landroidx/compose/ui/e;Lw/G;Lkotlin/jvm/functions/Function1;Lie/o;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/k$e;->a:Lw/o0;

    .line 2
    .line 3
    iput-object p2, p0, Lv/k$e;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-object p3, p0, Lv/k$e;->c:Lw/G;

    .line 6
    .line 7
    iput-object p4, p0, Lv/k$e;->d:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iput-object p5, p0, Lv/k$e;->e:Lie/o;

    .line 10
    .line 11
    iput p6, p0, Lv/k$e;->f:I

    .line 12
    .line 13
    iput p7, p0, Lv/k$e;->g:I

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

    invoke-virtual {p0, p1, p2}, Lv/k$e;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 8

    .line 2
    iget-object v0, p0, Lv/k$e;->a:Lw/o0;

    iget-object v1, p0, Lv/k$e;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Lv/k$e;->c:Lw/G;

    iget-object v3, p0, Lv/k$e;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lv/k$e;->e:Lie/o;

    iget p2, p0, Lv/k$e;->f:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v6

    iget v7, p0, Lv/k$e;->g:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lv/k;->b(Lw/o0;Landroidx/compose/ui/e;Lw/G;Lkotlin/jvm/functions/Function1;Lie/o;LY/m;II)V

    return-void
.end method
