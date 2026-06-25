.class final LT1/k$i$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT1/k$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT1/k;


# direct methods
.method constructor <init>(LT1/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT1/k$i$a;->a:LT1/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LTd/L;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, LT1/k$i$a;->a:LT1/k;

    .line 2
    .line 3
    invoke-static {p1}, LT1/k;->d(LT1/k;)LT1/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, LT1/l;->a()LT1/D;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of p1, p1, LT1/r;

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, LT1/k$i$a;->a:LT1/k;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-static {p1, v0, p2}, LT1/k;->m(LT1/k;ZLZd/e;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    sget-object p1, LTd/L;->a:LTd/L;

    .line 33
    .line 34
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LTd/L;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LT1/k$i$a;->a(LTd/L;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
