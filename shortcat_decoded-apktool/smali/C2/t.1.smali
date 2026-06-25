.class public final synthetic LC2/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LC2/y$a;

.field public final synthetic b:Lq2/x;

.field public final synthetic c:LA2/c;


# direct methods
.method public synthetic constructor <init>(LC2/y$a;Lq2/x;LA2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC2/t;->a:LC2/y$a;

    .line 5
    .line 6
    iput-object p2, p0, LC2/t;->b:Lq2/x;

    .line 7
    .line 8
    iput-object p3, p0, LC2/t;->c:LA2/c;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LC2/t;->a:LC2/y$a;

    .line 2
    .line 3
    iget-object v1, p0, LC2/t;->b:Lq2/x;

    .line 4
    .line 5
    iget-object v2, p0, LC2/t;->c:LA2/c;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LC2/y$a;->h(LC2/y$a;Lq2/x;LA2/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
