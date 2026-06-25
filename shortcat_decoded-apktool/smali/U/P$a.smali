.class final LU/P$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/P;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLC/P;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LW/e;

.field final synthetic b:LC/P;


# direct methods
.method constructor <init>(LW/e;LC/P;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/P$a;->a:LW/e;

    .line 2
    .line 3
    iput-object p2, p0, LU/P$a;->b:LC/P;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(LC/P;)V
    .locals 2

    .line 1
    iget-object v0, p0, LU/P$a;->a:LW/e;

    .line 2
    .line 3
    iget-object v1, p0, LU/P$a;->b:LC/P;

    .line 4
    .line 5
    invoke-static {v1, p1}, LC/S;->d(LC/P;LC/P;)LC/P;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, LW/e;->f(LC/P;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC/P;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LU/P$a;->a(LC/P;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
