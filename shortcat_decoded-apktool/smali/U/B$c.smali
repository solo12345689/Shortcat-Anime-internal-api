.class final LU/B$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/B;->a(Lw0/b;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/B$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LR0/C;

    invoke-virtual {p0, p1}, LU/B$c;->invoke(LR0/C;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LR0/C;)V
    .locals 1

    .line 2
    iget-object v0, p0, LU/B$c;->a:Ljava/lang/String;

    invoke-static {p1, v0}, LR0/A;->U(LR0/C;Ljava/lang/String;)V

    .line 3
    sget-object v0, LR0/h;->b:LR0/h$a;

    invoke-virtual {v0}, LR0/h$a;->e()I

    move-result v0

    invoke-static {p1, v0}, LR0/A;->c0(LR0/C;I)V

    return-void
.end method
