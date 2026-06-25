.class final LU/q$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LU/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LU/q$a;

    .line 2
    .line 3
    invoke-direct {v0}, LU/q$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU/q$a;->a:LU/q$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LU/W;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LU/q$a;->invoke(LU/W;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LU/W;LY/m;I)V
    .locals 18

    and-int/lit8 v0, p3, 0x6

    move-object/from16 v1, p1

    move-object/from16 v15, p2

    if-nez v0, :cond_1

    invoke-interface {v15, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    .line 2
    invoke-interface {v15}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v15}, LY/m;->K()V

    return-void

    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:220)"

    const v4, 0x30ccecff

    invoke-static {v4, v0, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    :cond_4
    and-int/lit8 v16, v0, 0xe

    const/16 v17, 0x1fe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    invoke-static/range {v1 .. v17}, LU/b0;->d(LU/W;Landroidx/compose/ui/e;ZLs0/E1;JJJJJLY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LY/w;->T()V

    :cond_5
    return-void
.end method
