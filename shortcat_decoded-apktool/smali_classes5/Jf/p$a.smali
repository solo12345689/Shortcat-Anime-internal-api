.class public final LJf/p$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJf/p;->a(LJf/e;Lkotlin/jvm/functions/Function2;)LJf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LJf/e;

.field final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(LJf/e;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJf/p$a;->a:LJf/e;

    .line 2
    .line 3
    iput-object p2, p0, LJf/p$a;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public collect(LJf/f;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LJf/p$a;->a:LJf/e;

    .line 7
    .line 8
    new-instance v2, LJf/p$b;

    .line 9
    .line 10
    iget-object v3, p0, LJf/p$a;->b:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    invoke-direct {v2, v0, p1, v3}, LJf/p$b;-><init>(Lkotlin/jvm/internal/J;LJf/f;Lkotlin/jvm/functions/Function2;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v2, p2}, LJf/e;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 27
    .line 28
    return-object p1
.end method
