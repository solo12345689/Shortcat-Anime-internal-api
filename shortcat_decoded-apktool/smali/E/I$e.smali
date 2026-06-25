.class final LE/I$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/I;-><init>(IILE/A;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE/I;

.field final synthetic b:I


# direct methods
.method constructor <init>(LE/I;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/I$e;->a:LE/I;

    .line 2
    .line 3
    iput p2, p0, LE/I$e;->b:I

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
.method public final a(LF/I;)V
    .locals 6

    .line 1
    iget-object v0, p0, LE/I$e;->a:LE/I;

    .line 2
    .line 3
    invoke-static {v0}, LE/I;->h(LE/I;)LE/A;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, LE/I$e;->b:I

    .line 8
    .line 9
    sget-object v2, Li0/l;->e:Li0/l$a;

    .line 10
    .line 11
    invoke-virtual {v2}, Li0/l$a;->d()Li0/l;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3}, Li0/l;->g()Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v4, 0x0

    .line 23
    :goto_0
    invoke-virtual {v2, v3}, Li0/l$a;->e(Li0/l;)Li0/l;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v2, v3, v5, v4}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, p1, v1}, LE/A;->a(LF/I;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LF/I;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LE/I$e;->a(LF/I;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
