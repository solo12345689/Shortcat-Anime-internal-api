.class final LW/j$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW/j;->a(LW/p;Ljava/lang/String;Lkotlin/jvm/functions/Function2;La1/f0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLB/k;LC/A;LU/f0;Lkotlin/jvm/functions/Function2;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU0/Y0;

.field final synthetic b:LU0/Y0;

.field final synthetic c:F

.field final synthetic d:LY/h2;

.field final synthetic e:Lkotlin/jvm/functions/Function2;

.field final synthetic f:Z

.field final synthetic g:LY/h2;


# direct methods
.method constructor <init>(LU0/Y0;LU0/Y0;FLY/h2;Lkotlin/jvm/functions/Function2;ZLY/h2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW/j$d;->a:LU0/Y0;

    .line 2
    .line 3
    iput-object p2, p0, LW/j$d;->b:LU0/Y0;

    .line 4
    .line 5
    iput p3, p0, LW/j$d;->c:F

    .line 6
    .line 7
    iput-object p4, p0, LW/j$d;->d:LY/h2;

    .line 8
    .line 9
    iput-object p5, p0, LW/j$d;->e:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    iput-boolean p6, p0, LW/j$d;->f:Z

    .line 12
    .line 13
    iput-object p7, p0, LW/j$d;->g:LY/h2;

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

    invoke-virtual {p0, p1, p2}, LW/j$d;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 36

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

    const-string v3, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)"

    const v4, -0x49b4cc60

    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    iget-object v1, v0, LW/j$d;->a:LU0/Y0;

    iget-object v2, v0, LW/j$d;->b:LU0/Y0;

    iget v3, v0, LW/j$d;->c:F

    invoke-static {v1, v2, v3}, LU0/Z0;->c(LU0/Y0;LU0/Y0;F)LU0/Y0;

    move-result-object v4

    iget-boolean v1, v0, LW/j$d;->f:Z

    iget-object v2, v0, LW/j$d;->g:LY/h2;

    if-eqz v1, :cond_3

    .line 6
    invoke-interface {v2}, LY/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls0/r0;

    invoke-virtual {v1}, Ls0/r0;->A()J

    move-result-wide v5

    const v34, 0xfffffe

    const/16 v35, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v4 .. v35}, LU0/Y0;->e(LU0/Y0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;LU0/G;Lg1/h;IILg1/u;ILjava/lang/Object;)LU0/Y0;

    move-result-object v4

    :cond_3
    move-object v7, v4

    .line 7
    iget-object v1, v0, LW/j$d;->d:LY/h2;

    invoke-interface {v1}, LY/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls0/r0;

    invoke-virtual {v1}, Ls0/r0;->A()J

    move-result-wide v5

    iget-object v8, v0, LW/j$d;->e:Lkotlin/jvm/functions/Function2;

    const/4 v10, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v5 .. v10}, LW/j;->f(JLU0/Y0;Lkotlin/jvm/functions/Function2;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LY/w;->T()V

    :cond_4
    return-void
.end method
