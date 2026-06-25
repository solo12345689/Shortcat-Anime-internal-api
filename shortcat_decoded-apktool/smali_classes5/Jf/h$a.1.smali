.class public final LJf/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJf/h;->c(Ljava/lang/Object;)LJf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJf/h$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public collect(LJf/f;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LJf/h$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {p1, v0, p2}, LJf/f;->emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p1
.end method
