.class final Lz/c$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/c;->c(Lz/f$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/c;

.field final synthetic b:Lz/f$a;


# direct methods
.method constructor <init>(Lz/c;Lz/f$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/c$a;->a:Lz/c;

    .line 2
    .line 3
    iput-object p2, p0, Lz/c$a;->b:Lz/f$a;

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lz/c$a;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lz/c$a;->a:Lz/c;

    invoke-static {p1}, Lz/c;->a(Lz/c;)La0/c;

    move-result-object p1

    iget-object v0, p0, Lz/c$a;->b:Lz/f$a;

    invoke-virtual {p1, v0}, La0/c;->w(Ljava/lang/Object;)Z

    return-void
.end method
