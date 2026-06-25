.class public final Landroidx/lifecycle/P;
.super Landroidx/lifecycle/W$e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/lifecycle/W$c;


# instance fields
.field private b:Landroid/app/Application;

.field private final c:Landroidx/lifecycle/W$c;

.field private d:Landroid/os/Bundle;

.field private e:Landroidx/lifecycle/k;

.field private f:LP3/f;


# direct methods
.method public constructor <init>(Landroid/app/Application;LP3/i;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/lifecycle/W$e;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p2}, LP3/i;->getSavedStateRegistry()LP3/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Landroidx/lifecycle/P;->f:LP3/f;

    .line 14
    .line 15
    invoke-interface {p2}, Landroidx/lifecycle/r;->getLifecycle()Landroidx/lifecycle/k;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Landroidx/lifecycle/P;->e:Landroidx/lifecycle/k;

    .line 20
    .line 21
    iput-object p3, p0, Landroidx/lifecycle/P;->d:Landroid/os/Bundle;

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/lifecycle/P;->b:Landroid/app/Application;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    sget-object p2, Landroidx/lifecycle/W$a;->c:Landroidx/lifecycle/W$a$a;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Landroidx/lifecycle/W$a$a;->a(Landroid/app/Application;)Landroidx/lifecycle/W$a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, Landroidx/lifecycle/W$a;

    .line 35
    .line 36
    invoke-direct {p1}, Landroidx/lifecycle/W$a;-><init>()V

    .line 37
    .line 38
    .line 39
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/P;->c:Landroidx/lifecycle/W$c;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/U;)V
    .locals 2

    .line 1
    const-string v0, "viewModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/P;->e:Landroidx/lifecycle/k;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/lifecycle/P;->f:LP3/f;

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/lifecycle/P;->e:Landroidx/lifecycle/k;

    .line 16
    .line 17
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Landroidx/lifecycle/i;->a(Landroidx/lifecycle/U;LP3/f;Landroidx/lifecycle/k;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/U;
    .locals 5

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modelClass"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/P;->e:Landroidx/lifecycle/k;

    .line 12
    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    const-class v1, Landroidx/lifecycle/a;

    .line 16
    .line 17
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/lifecycle/P;->b:Landroid/app/Application;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-static {}, Landroidx/lifecycle/Q;->a()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {p2, v2}, Landroidx/lifecycle/Q;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {}, Landroidx/lifecycle/Q;->b()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {p2, v2}, Landroidx/lifecycle/Q;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :goto_0
    if-nez v2, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Landroidx/lifecycle/P;->b:Landroid/app/Application;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Landroidx/lifecycle/P;->c:Landroidx/lifecycle/W$c;

    .line 51
    .line 52
    invoke-interface {p1, p2}, Landroidx/lifecycle/W$c;->create(Ljava/lang/Class;)Landroidx/lifecycle/U;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_1
    sget-object p1, Landroidx/lifecycle/W$d;->Companion:Landroidx/lifecycle/W$d$a;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroidx/lifecycle/W$d$a;->a()Landroidx/lifecycle/W$d;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1, p2}, Landroidx/lifecycle/W$d;->create(Ljava/lang/Class;)Landroidx/lifecycle/U;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_2
    iget-object v3, p0, Landroidx/lifecycle/P;->f:LP3/f;

    .line 69
    .line 70
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v4, p0, Landroidx/lifecycle/P;->d:Landroid/os/Bundle;

    .line 74
    .line 75
    invoke-static {v3, v0, p1, v4}, Landroidx/lifecycle/i;->b(LP3/f;Landroidx/lifecycle/k;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/K;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    iget-object v0, p0, Landroidx/lifecycle/P;->b:Landroid/app/Application;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Landroidx/lifecycle/K;->b()Landroidx/lifecycle/I;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {p2, v2, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/U;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    invoke-virtual {p1}, Landroidx/lifecycle/K;->b()Landroidx/lifecycle/I;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {p2, v2, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/U;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    :goto_1
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    .line 114
    .line 115
    invoke-virtual {p2, v0, p1}, Landroidx/lifecycle/U;->addCloseable(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    .line 116
    .line 117
    .line 118
    return-object p2

    .line 119
    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 120
    .line 121
    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    .line 122
    .line 123
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1
.end method

.method public create(Ljava/lang/Class;)Landroidx/lifecycle/U;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 22
    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/P;->b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public create(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/U;
    .locals 3

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Landroidx/lifecycle/W;->c:Lm2/a$c;

    invoke-virtual {p2, v0}, Lm2/a;->a(Lm2/a$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 3
    sget-object v1, Landroidx/lifecycle/L;->a:Lm2/a$c;

    invoke-virtual {p2, v1}, Lm2/a;->a(Lm2/a$c;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 4
    sget-object v1, Landroidx/lifecycle/L;->b:Lm2/a$c;

    invoke-virtual {p2, v1}, Lm2/a;->a(Lm2/a$c;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 5
    sget-object v0, Landroidx/lifecycle/W$a;->e:Lm2/a$c;

    invoke-virtual {p2, v0}, Lm2/a;->a(Lm2/a$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    .line 6
    const-class v1, Landroidx/lifecycle/a;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {}, Landroidx/lifecycle/Q;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v2}, Landroidx/lifecycle/Q;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Landroidx/lifecycle/Q;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v2}, Landroidx/lifecycle/Q;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    .line 9
    iget-object v0, p0, Landroidx/lifecycle/P;->c:Landroidx/lifecycle/W$c;

    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/W$c;->create(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 10
    invoke-static {p2}, Landroidx/lifecycle/L;->b(Lm2/a;)Landroidx/lifecycle/I;

    move-result-object p2

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p2

    .line 11
    invoke-static {p1, v2, p2}, Landroidx/lifecycle/Q;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1

    .line 12
    :cond_2
    invoke-static {p2}, Landroidx/lifecycle/L;->b(Lm2/a;)Landroidx/lifecycle/I;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, Landroidx/lifecycle/Q;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1

    .line 13
    :cond_3
    iget-object p2, p0, Landroidx/lifecycle/P;->e:Landroidx/lifecycle/k;

    if-eqz p2, :cond_4

    .line 14
    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/P;->b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1

    .line 15
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    .line 20
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public create(Lpe/d;Lm2/a;)Landroidx/lifecycle/U;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/P;->create(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1
.end method
