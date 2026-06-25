.class final LU/P$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/P;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLC/P;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkotlin/jvm/functions/Function2;

.field final synthetic c:Lie/o;

.field final synthetic d:Lkotlin/jvm/functions/Function2;

.field final synthetic e:Lkotlin/jvm/functions/Function2;

.field final synthetic f:LW/e;

.field final synthetic g:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(ILkotlin/jvm/functions/Function2;Lie/o;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LW/e;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput p1, p0, LU/P$b;->a:I

    .line 2
    .line 3
    iput-object p2, p0, LU/P$b;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iput-object p3, p0, LU/P$b;->c:Lie/o;

    .line 6
    .line 7
    iput-object p4, p0, LU/P$b;->d:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iput-object p5, p0, LU/P$b;->e:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    iput-object p6, p0, LU/P$b;->f:LW/e;

    .line 12
    .line 13
    iput-object p7, p0, LU/P$b;->g:Lkotlin/jvm/functions/Function2;

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

    invoke-virtual {p0, p1, p2}, LU/P$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)"

    const v2, -0x75f846d6

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    iget v3, p0, LU/P$b;->a:I

    .line 6
    iget-object v4, p0, LU/P$b;->b:Lkotlin/jvm/functions/Function2;

    .line 7
    iget-object v5, p0, LU/P$b;->c:Lie/o;

    .line 8
    iget-object v6, p0, LU/P$b;->d:Lkotlin/jvm/functions/Function2;

    .line 9
    iget-object v7, p0, LU/P$b;->e:Lkotlin/jvm/functions/Function2;

    .line 10
    iget-object v8, p0, LU/P$b;->f:LW/e;

    .line 11
    iget-object v9, p0, LU/P$b;->g:Lkotlin/jvm/functions/Function2;

    const/4 v11, 0x0

    move-object v10, p1

    .line 12
    invoke-static/range {v3 .. v11}, LU/P;->c(ILkotlin/jvm/functions/Function2;Lie/o;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LC/P;Lkotlin/jvm/functions/Function2;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
