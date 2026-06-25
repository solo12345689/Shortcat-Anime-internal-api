.class public final LWb/a$a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWb/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LVb/a;

.field final synthetic b:LWb/a$a$a;


# direct methods
.method public constructor <init>(LVb/a;LWb/a$a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LWb/a$a$b;->a:LVb/a;

    .line 2
    .line 3
    iput-object p2, p0, LWb/a$a$b;->b:LWb/a$a$a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, LWb/a$a$b;->a:LVb/a;

    .line 2
    .line 3
    iget-object v0, p0, LWb/a$a$b;->b:LWb/a$a$a;

    .line 4
    .line 5
    invoke-interface {p1, v0}, LVb/a;->b(LVb/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LWb/a$a$b;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
