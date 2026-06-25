.class public final LF/i$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/i;->a(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/i;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:I


# direct methods
.method constructor <init>(LF/i;Lkotlin/jvm/internal/N;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/i$d;->a:LF/i;

    .line 2
    .line 3
    iput-object p2, p0, LF/i$d;->b:Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    iput p3, p0, LF/i$d;->c:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    .line 1
    iget-object v0, p0, LF/i$d;->a:LF/i;

    .line 2
    .line 3
    iget-object v1, p0, LF/i$d;->b:Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LF/h$a;

    .line 8
    .line 9
    iget v2, p0, LF/i$d;->c:I

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, LF/i;->c(LF/i;LF/h$a;I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method
