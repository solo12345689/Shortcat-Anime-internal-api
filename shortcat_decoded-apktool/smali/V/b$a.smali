.class public final LV/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/b;->a(LY/m;I)LY/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LJf/e;


# direct methods
.method public constructor <init>(LJf/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV/b$a;->a:LJf/e;

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
    .locals 2

    .line 1
    iget-object v0, p0, LV/b$a;->a:LJf/e;

    .line 2
    .line 3
    new-instance v1, LV/b$a$a;

    .line 4
    .line 5
    invoke-direct {v1, p1}, LV/b$a$a;-><init>(LJf/f;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2}, LJf/e;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 20
    .line 21
    return-object p1
.end method
