.class public final LLc/a$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLc/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLc/a;


# direct methods
.method public constructor <init>(LLc/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LLc/a$d;->a:LLc/a;

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
    sget-object v0, LDc/b;->a:LDc/b;

    .line 2
    .line 3
    iget-object v1, p0, LLc/a$d;->a:LLc/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LDc/b;->f(LOc/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLc/a$d;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
