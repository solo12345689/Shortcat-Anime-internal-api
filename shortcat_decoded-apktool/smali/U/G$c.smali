.class final LU/G$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/G;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLa1/f0;LB/k;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LU/f0;LC/A;Lkotlin/jvm/functions/Function2;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:LB/k;

.field final synthetic d:LU/f0;


# direct methods
.method constructor <init>(ZZLB/k;LU/f0;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LU/G$c;->a:Z

    .line 2
    .line 3
    iput-boolean p2, p0, LU/G$c;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, LU/G$c;->c:LB/k;

    .line 6
    .line 7
    iput-object p4, p0, LU/G$c;->d:LU/f0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
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

    invoke-virtual {p0, p1, p2}, LU/G$c;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface/range {p1 .. p1}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface/range {p1 .. p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:873)"

    const v4, -0x56576ca2

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    sget-object v5, LU/G;->a:LU/G;

    .line 5
    iget-boolean v6, v0, LU/G$c;->a:Z

    .line 6
    iget-boolean v7, v0, LU/G$c;->b:Z

    .line 7
    iget-object v8, v0, LU/G$c;->c:LB/k;

    .line 8
    sget-object v9, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 9
    iget-object v10, v0, LU/G$c;->d:LU/f0;

    const/4 v1, 0x6

    move-object/from16 v14, p1

    .line 10
    invoke-virtual {v5, v14, v1}, LU/G;->j(LY/m;I)Ls0/E1;

    move-result-object v11

    .line 11
    invoke-virtual {v5}, LU/G;->g()F

    move-result v12

    .line 12
    invoke-virtual {v5}, LU/G;->k()F

    move-result v13

    const v15, 0x6d80c00

    const/16 v16, 0x0

    .line 13
    invoke-virtual/range {v5 .. v16}, LU/G;->a(ZZLB/k;Landroidx/compose/ui/e;LU/f0;Ls0/E1;FFLY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
