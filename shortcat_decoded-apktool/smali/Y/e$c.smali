.class final LY/e$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY/e;->A1(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/e$b;

.field final synthetic b:LY/e;

.field final synthetic c:Lkotlin/jvm/internal/L;


# direct methods
.method constructor <init>(LY/e$b;LY/e;Lkotlin/jvm/internal/L;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/e$c;->a:LY/e$b;

    .line 2
    .line 3
    iput-object p2, p0, LY/e$c;->b:LY/e;

    .line 4
    .line 5
    iput-object p3, p0, LY/e$c;->c:Lkotlin/jvm/internal/L;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, LY/e$c;->a:LY/e$b;

    .line 2
    .line 3
    invoke-virtual {p1}, LY/e$b;->a()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LY/e$c;->b:LY/e;

    .line 7
    .line 8
    invoke-static {p1}, LY/e;->i(LY/e;)Lg0/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, LY/e$c;->c:Lkotlin/jvm/internal/L;

    .line 13
    .line 14
    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    ushr-int/lit8 v2, v1, 0x1b

    .line 21
    .line 22
    and-int/lit8 v2, v2, 0xf

    .line 23
    .line 24
    if-ne v2, v0, :cond_1

    .line 25
    .line 26
    add-int/lit8 v2, v1, -0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v2, v1

    .line 30
    :goto_0
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LY/e$c;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
