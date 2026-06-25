.class final LF/A$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/A;->a(Ljava/lang/Object;ILF/B;Lkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/z;


# direct methods
.method constructor <init>(LF/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/A$a;->a:LF/z;

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
.method public final invoke(LY/Y;)LY/X;
    .locals 1

    .line 1
    iget-object p1, p0, LF/A$a;->a:LF/z;

    .line 2
    new-instance v0, LF/A$a$a;

    invoke-direct {v0, p1}, LF/A$a$a;-><init>(LF/z;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, LF/A$a;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
