.class final LI0/e$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI0/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LI0/e$a;

    .line 2
    .line 3
    invoke-direct {v0}, LI0/e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LI0/e$a;->a:LI0/e$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
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

    invoke-virtual {p0, p1, p2}, LI0/e$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, LY/m;->p(ZI)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    const-string v0, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda$641200809.<anonymous> (SubcomposeLayout.kt:623)"

    const v1, 0x2637f2a9

    invoke-static {v1, p2, p1, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 2
    :cond_1
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LY/w;->T()V

    :cond_2
    return-void

    :cond_3
    invoke-interface {p1}, LY/m;->K()V

    return-void
.end method
