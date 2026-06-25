.class public final LK/T$a$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/T$a$a;->invoke(LY/Y;)LY/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/C0;

.field final synthetic b:LB/m;


# direct methods
.method public constructor <init>(LY/C0;LB/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/T$a$a$a;->a:LY/C0;

    .line 2
    .line 3
    iput-object p2, p0, LK/T$a$a$a;->b:LB/m;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, LK/T$a$a$a;->a:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LB/o$b;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    new-instance v1, LB/o$a;

    .line 12
    .line 13
    invoke-direct {v1, v0}, LB/o$a;-><init>(LB/o$b;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LK/T$a$a$a;->b:LB/m;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {v0, v1}, LB/m;->a(LB/j;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, LK/T$a$a$a;->a:LY/C0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-interface {v0, v1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method
