.class public final Lzc/g$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc/g;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lzc/g;


# direct methods
.method public constructor <init>(Lzc/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzc/g$e;->a:Lzc/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget-object v0, Lzc/i;->a:Lzc/i;

    .line 2
    .line 3
    iget-object v1, p0, Lzc/g$e;->a:Lzc/g;

    .line 4
    .line 5
    invoke-static {v1}, Lzc/g;->z(Lzc/g;)Lie/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lzc/i;->a(Lie/a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzc/g$e;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
