.class final LBb/e$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBb/e;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/fetch/NativeResponse;

.field final synthetic b:LUb/u;


# direct methods
.method constructor <init>(Lexpo/modules/fetch/NativeResponse;LUb/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, LBb/e$b;->a:Lexpo/modules/fetch/NativeResponse;

    .line 2
    .line 3
    iput-object p2, p0, LBb/e$b;->b:LUb/u;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LBb/p;)V
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LBb/e$b;->a:Lexpo/modules/fetch/NativeResponse;

    .line 7
    .line 8
    invoke-virtual {p1}, Lexpo/modules/fetch/NativeResponse;->q1()LBb/o;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p1, v0}, LBb/o;->b(Z)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, LBb/e$b;->b:LUb/u;

    .line 18
    .line 19
    new-instance v1, Lexpo/modules/kotlin/jni/NativeArrayBuffer;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Lexpo/modules/kotlin/jni/NativeArrayBuffer;-><init>(Ljava/nio/ByteBuffer;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, LUb/u;->resolve(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LBb/p;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LBb/e$b;->a(LBb/p;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
