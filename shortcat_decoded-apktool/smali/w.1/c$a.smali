.class final Lw/c$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/c;->e(Ljava/lang/Object;Lw/s0;Lw/i;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIf/g;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(LIf/g;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/c$a;->a:LIf/g;

    .line 2
    .line 3
    iput-object p2, p0, Lw/c$a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw/c$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lw/c$a;->a:LIf/g;

    iget-object v1, p0, Lw/c$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, LIf/w;->d(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
